package defpackage;

import java.io.EOFException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4323i11<T> implements WM<T, AbstractC5395ms1> {
    public static final CY0 b;
    public final AbstractC5897pG0<T> a;

    static {
        Pattern pattern = CY0.d;
        b = CY0.a.a("application/json; charset=UTF-8");
    }

    public C4323i11(AbstractC5897pG0<T> abstractC5897pG0) {
        this.a = abstractC5897pG0;
    }

    @Override // defpackage.WM
    public final AbstractC5395ms1 a(Object obj) throws EOFException {
        C1481Lu c1481Lu = new C1481Lu();
        this.a.e(new UH0(c1481Lu), obj);
        C1802Pw content = c1481Lu.X(c1481Lu.e);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new C4972ks1(b, content);
    }
}
