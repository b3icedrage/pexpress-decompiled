package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Q42 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<E42> c = new ArrayList<>();

    @Deprecated
    public Q42() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q42)) {
            return false;
        }
        Q42 q42 = (Q42) obj;
        return this.b == q42.b && this.a.equals(q42.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = K1.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbB.append(this.b);
        sbB.append("\n");
        String strC = Z0.c(sbB.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strC = strC + "    " + str + ": " + map.get(str) + "\n";
        }
        return strC;
    }

    public Q42(@NonNull View view) {
        this.b = view;
    }
}
