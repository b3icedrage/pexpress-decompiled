package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Ui2 {
    public final WindowId a;

    public Ui2(@NonNull ViewGroup viewGroup) {
        this.a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Ui2) && ((Ui2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
