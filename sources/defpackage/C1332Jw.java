package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1332Jw implements InterfaceC1608Nj0 {
    public static String a(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String b(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static StringBuilder c(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) obj;
        if (abstractC7844yZ0 instanceof TD) {
            return ((TD) abstractC7844yZ0).a.e;
        }
        if (abstractC7844yZ0 instanceof LF1) {
            return ((LF1) abstractC7844yZ0).a.e;
        }
        throw new IllegalArgumentException("There is unhandled type of client text message");
    }
}
