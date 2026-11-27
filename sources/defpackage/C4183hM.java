package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4183hM {

    @NotNull
    public static final FS0 a = C6561sS.f("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    @NotNull
    public static final Set<RI0<?>> b;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        RI0[] elements = {c2251Vp1.b(byte[].class), c2251Vp1.b(String.class), c2251Vp1.b(C0850Dr0.class), c2251Vp1.b(InterfaceC0942Ew.class), c2251Vp1.b(AbstractC1112Ha1.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        b = C1526Mj.H(elements);
    }
}
