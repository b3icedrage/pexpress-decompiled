package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: mK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5279mK0 {
    public static final C5279mK0 c = new C5279mK0("COMPOSITION");
    public final List<String> a;
    public InterfaceC5489nK0 b;

    public C5279mK0(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    public final boolean a(int i, String str) {
        List<String> list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && list.get(list.size() - 1).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !list.get(i + 1).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return list.get(i2).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && list.get(list.size() - 1).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.a;
        if (list.get(i).equals("**")) {
            return (i != list.size() - 1 && list.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return list.get(i).equals(str) || list.get(i).equals("**") || list.get(i).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        return i < list.size() - 1 || list.get(i).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5279mK0.class == obj.getClass()) {
            C5279mK0 c5279mK0 = (C5279mK0) obj;
            if (!this.a.equals(c5279mK0.a)) {
                return false;
            }
            InterfaceC5489nK0 interfaceC5489nK0 = this.b;
            InterfaceC5489nK0 interfaceC5489nK1 = c5279mK0.b;
            if (interfaceC5489nK0 != null) {
                return interfaceC5489nK0.equals(interfaceC5489nK1);
            }
            if (interfaceC5489nK1 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC5489nK0 interfaceC5489nK0 = this.b;
        return iHashCode + (interfaceC5489nK0 != null ? interfaceC5489nK0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return C4564j.f(sb, this.b != null, '}');
    }

    public C5279mK0(C5279mK0 c5279mK0) {
        this.a = new ArrayList(c5279mK0.a);
        this.b = c5279mK0.b;
    }
}
