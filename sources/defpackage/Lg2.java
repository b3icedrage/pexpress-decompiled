package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$resolveConnectableUrl$url$1", f = "WebSocketRequestExecutorBase.kt", l = {255, 263, 265}, m = "invokeSuspend")
public final class Lg2 extends AW1 implements Function2<KN, JM<? super String>, Object> {
    public C3027bp1 d;
    public Serializable e;
    public Fg2 g;
    public C2590Zo1 h;
    public C3027bp1 i;
    public int j;
    public int k;
    public int l;
    public final /* synthetic */ Fg2<Object> m;
    public final /* synthetic */ C2590Zo1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg2(Fg2<Object> fg2, C2590Zo1 c2590Zo1, JM<? super Lg2> jm) {
        super(2, jm);
        this.m = fg2;
        this.n = c2590Zo1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Lg2(this.m, this.n, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super String> jm) {
        return ((Lg2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x011f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011f -> B:34:0x0122). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Lg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
