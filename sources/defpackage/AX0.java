package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.MaterialCalendar;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes.dex */
public final class AX0 extends R1 {
    public final /* synthetic */ MaterialCalendar d;

    public AX0(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // defpackage.R1
    public final void d(View view, @NonNull C5426n2 c5426n2) {
        this.a.onInitializeAccessibilityNodeInfo(view, c5426n2.a);
        MaterialCalendar materialCalendar = this.d;
        c5426n2.k(materialCalendar.r.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
