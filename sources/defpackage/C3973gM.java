package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", l = {232}, m = "convertResponse$ktor_client_content_negotiation")
public final class C3973gM extends LM {
    public La2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2701aM g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3973gM(C2701aM c2701aM, LM lm) {
        super(lm);
        this.g = c2701aM;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, null, null, null, this);
    }
}
