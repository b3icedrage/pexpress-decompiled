package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Timeline$start$1", f = "Timeline.kt", l = {28, 39, RequestError.NETWORK_FAILURE}, m = "invokeSuspend")
public final class GZ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public InterfaceC2621Zz d;
    public int e;
    public final /* synthetic */ KZ1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZ1(KZ1 kz1, JM<? super GZ1> jm) {
        super(2, jm);
        this.g = kz1;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new GZ1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((GZ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[PHI: r1
      0x00aa: PHI (r1v9 Zz) = (r1v3 Zz), (r1v8 Zz), (r1v11 Zz) binds: [B:35:0x009e, B:42:0x00cb, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[PHI: r1 r11
      0x00b5: PHI (r1v8 Zz) = (r1v9 Zz), (r1v10 Zz) binds: [B:37:0x00b2, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r11v15 java.lang.Object) = (r11v22 java.lang.Object), (r11v0 java.lang.Object) binds: [B:37:0x00b2, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cb -> B:36:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GZ1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
