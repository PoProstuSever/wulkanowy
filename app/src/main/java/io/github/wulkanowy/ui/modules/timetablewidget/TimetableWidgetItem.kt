package io.github.wulkanowy.ui.modules.timetablewidget

import io.github.wulkanowy.data.db.entities.Timetable
import java.time.Instant

sealed class TimetableWidgetItem(val type: TimetableWidgetItemType) {

    data class Normal(
        val lesson: Timetable,
    ) : TimetableWidgetItem(TimetableWidgetItemType.NORMAL)

    data class Empty(
        val numFrom: Int,
        val numTo: Int
    ) : TimetableWidgetItem(TimetableWidgetItemType.EMPTY)

    data class Synchronized(
        val timestamp: Instant,
    ) : TimetableWidgetItem(TimetableWidgetItemType.SYNCHRONIZED)
}

enum class TimetableWidgetItemType {
    NORMAL,
    EMPTY,
    SYNCHRONIZED,
}
