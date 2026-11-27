package defpackage;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: fU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3788fU0 {
    public HashMap c;
    public HashMap d;
    public HashMap e;
    public ArrayList f;
    public C5502nO1<C2067Tg0> g;
    public HT0<ZN0> h;
    public ArrayList i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public final C6389rd1 a = new C6389rd1();
    public final HashSet<String> b = new HashSet<>();
    public int o = 0;

    public final void a(String str) {
        CS0.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.l - this.k) / this.m) * 1000.0f);
    }

    public final VW0 c(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            VW0 vw0 = (VW0) this.f.get(i);
            String str2 = vw0.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return vw0;
            }
        }
        return null;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(((ZN0) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
