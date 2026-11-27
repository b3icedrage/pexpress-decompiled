package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: renamed from: zX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8048zX0 extends RecyclerView.l {
    public final Calendar a = Qb2.e(null);
    public final Calendar b = Qb2.e(null);
    public final /* synthetic */ MaterialCalendar c;

    public C8048zX0(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof Nl2) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Nl2 nl2 = (Nl2) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            for (C1037Gb1<Long, Long> c1037Gb1 : materialCalendar.g.L()) {
                Long l = c1037Gb1.a;
                if (l != null && c1037Gb1.b != null) {
                    long jLongValue = l.longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = c1037Gb1.b.longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - nl2.d.h.d.g;
                    int i2 = calendar2.get(1) - nl2.d.h.d.g;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i6);
                        if (viewQ3 != null) {
                            int top = viewQ3.getTop() + materialCalendar.l.d.a.top;
                            int bottom = viewQ3.getBottom() - materialCalendar.l.d.a.bottom;
                            canvas.drawRect((i6 != i4 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), top, (i6 != i5 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), bottom, materialCalendar.l.h);
                        }
                    }
                }
            }
        }
    }
}
