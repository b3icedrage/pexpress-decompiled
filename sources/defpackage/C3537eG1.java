package defpackage;

import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3537eG1 {

    @NotNull
    public final C3747fG1 a;

    @NotNull
    public final List b;

    public C3537eG1(@NotNull C3747fG1 c3747fG1, @NotNull List list) {
        p.b(c3747fG1, "SentryEnvelopeHeader is required.");
        this.a = c3747fG1;
        p.b(list, "SentryEnvelope items are required.");
        this.b = list;
    }

    public C3537eG1(@Nullable u uVar, @Nullable r rVar, @NotNull CG1 cg1) {
        this.a = new C3747fG1(uVar, rVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(cg1);
        this.b = arrayList;
    }
}
