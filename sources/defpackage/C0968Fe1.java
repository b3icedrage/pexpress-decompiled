package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968Fe1 {
    public static final boolean a(@NotNull C0857Dt1 c0857Dt1) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(c0857Dt1, "<this>");
        C1318Jr0 c1318Jr0 = c0857Dt1.d.a;
        ArrayList arrayList = c1318Jr0.f;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((String) objPrevious).length() <= 0);
        if (!Intrinsics.a(objPrevious, "login")) {
            return false;
        }
        return Intrinsics.a(b(c1318Jr0), b(((C0857Dt1) JH1.l(FH1.e(c0857Dt1, new C0890Ee1()))).d.a));
    }

    public static final String b(C1318Jr0 c1318Jr0) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            String str = c1318Jr0.d;
            byte[] bArr = C6806tc2.a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            objA = C6806tc2.f.d(str) ? null : PublicSuffixDatabase.g.a(str);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        String str2 = (String) (objA instanceof C1717Ot1.b ? null : objA);
        return str2 == null ? c1318Jr0.d : str2;
    }
}
