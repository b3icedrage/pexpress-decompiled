package defpackage;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5734oW extends AbstractC1112Ha1.c {

    @Nullable
    public final Long a;

    @NotNull
    public final C4651jM b;
    public final /* synthetic */ Object c;

    public C5734oW(C3032br0 c3032br0, C4651jM c4651jM, Object obj) {
        this.c = obj;
        C3441do0 c3441do0 = c3032br0.c;
        List<String> list = C1159Hq0.a;
        String strF = c3441do0.f("Content-Length");
        this.a = strF != null ? Long.valueOf(Long.parseLong(strF)) : null;
        if (c4651jM == null) {
            C4651jM c4651jM2 = C4651jM.a.a;
            c4651jM = C4651jM.a.b;
        }
        this.b = c4651jM;
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.AbstractC1112Ha1
    @NotNull
    public final C4651jM b() {
        return this.b;
    }

    @Override // defpackage.AbstractC1112Ha1.c
    @NotNull
    public final InterfaceC0942Ew d() {
        InputStream inputStream = (InputStream) this.c;
        ExecutorC7200vV context = C6266r20.c;
        C2349Wv.a pool = C2349Wv.a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return SN.a(C6215qm0.d, context, true, new C1463Ln1(pool, inputStream, null)).e;
    }
}
