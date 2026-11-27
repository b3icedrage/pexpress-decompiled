package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6363rW implements InterfaceC5235m62 {

    @NotNull
    public static final C6363rW a = new C6363rW();

    @Override // defpackage.InterfaceC5235m62
    @NotNull
    public final C5655o62 a(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            C5655o62.e.getClass();
            return C5655o62.g;
        }
        C5655o62.a aVar = C5655o62.e;
        List listC = VE.c(new C2755ad(annotations));
        aVar.getClass();
        return C5655o62.a.a(listC);
    }
}
