package org.jetbrains.haskell.debugger

import org.jetbrains.haskell.debugger.actions.SwitchableAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.xdebugger.ui.XDebugTabLayouter
import com.intellij.execution.ui.RunnerLayoutUi
import com.intellij.openapi.actionSystem.DefaultActionGroup
import org.jetbrains.haskell.debugger.highlighting.HsExecutionPointHighlighter
import com.intellij.ui.AppUIUtil
import org.jetbrains.haskell.debugger.frames.HsStackFrame
import org.jetbrains.haskell.debugger.parser.HsFilePosition

/**
 * Created by vlad on 8/5/14.
 */

public class HistoryManager(private val debugProcess: HaskellDebugProcess): XDebugTabLayouter() {
    private val historyPanel: HistoryPanel = HistoryPanel(debugProcess)
    private val historyHighlighter = HsExecutionPointHighlighter(debugProcess.getSession()!!.getProject(), HsExecutionPointHighlighter.HighlighterType.HISTORY)
    private val backAction: SwitchableAction = object : SwitchableAction("back", "Move back along history", com.intellij.icons.AllIcons.Actions.Back) {
        override fun actionPerformed(e: AnActionEvent?) {
            debugProcess.debugger.back()
        }
    }
    private val forwardAction: SwitchableAction = object : SwitchableAction("forward", "Move forward along history", com.intellij.icons.AllIcons.Actions.Forward) {
        override fun actionPerformed(e: AnActionEvent?) {
            debugProcess.debugger.forward()
        }
    }

    override fun registerAdditionalContent(ui: RunnerLayoutUi) {
        val context = ui.createContent("history", historyPanel, "History", null, null)
        ui.addContent(context)
    }

    public fun registerActions(leftToolbar: DefaultActionGroup, topToolbar: DefaultActionGroup) {
        topToolbar.addSeparator()
        topToolbar.add(backAction)
        topToolbar.add(forwardAction)
    }

    public fun historyChanged(topHistory: Boolean, bottomHistory: Boolean, position: HsFilePosition) {
        AppUIUtil.invokeLaterIfProjectAlive(debugProcess.getSession()!!.getProject(), Runnable({() ->
            backAction.enabled = !bottomHistory
            forwardAction.enabled = !topHistory
            historyPanel.setCurrentSpan(position.toString())
            historyHighlighter.show(object : HsStackFrame(debugProcess, position, null) {
                override fun tryGetBindings() {
                }
            }, true, null)
        }))
    }
}