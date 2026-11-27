package defpackage;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", l = {182}, m = "convertRequest$ktor_client_content_negotiation")
public final class C3553eM extends LM {
    public C3032br0 d;
    public Object e;
    public C4651jM g;
    public List h;
    public Iterator i;
    public C2701aM.a.C0214a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C2701aM l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3553eM(C2701aM c2701aM, LM lm) {
        super(lm);
        this.l = c2701aM;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
