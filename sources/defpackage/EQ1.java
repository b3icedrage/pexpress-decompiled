package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class EQ1 {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EQ1)) {
            return false;
        }
        ((EQ1) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + EF0.a(R.string.one_click_stop_description, EF0.a(R.string.one_click_stop_text, EF0.a(R.string.stop_robot_dialog_tittle, Integer.hashCode(R.drawable.ic_information) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        return "StopConfirmParams(titleIconId=2131231180, titleTextId=2131952542, switchTitle=2131952349, switchDescription=2131952348, switchDefault=false)";
    }
}
