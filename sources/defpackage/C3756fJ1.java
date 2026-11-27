package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3756fJ1 implements InterfaceC3546eJ1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ZT1 b;

    @NotNull
    public final InterfaceC1131Hh c;

    /* JADX INFO: renamed from: fJ1$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.SetConversionUseCaseBase", f = "SetConversionUseCaseBase.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, ConnectionResult.API_DISABLED_FOR_CONNECTION, 25, 19}, m = "setConversion$suspendImpl")
    public static final class a extends LM {
        public Object d;
        public Object e;
        public String g;
        public String h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return C3756fJ1.b(C3756fJ1.this, this);
        }
    }

    public C3756fJ1(@NotNull C4923kf appData, @NotNull ZT1 subIdProvider, @NotNull InterfaceC1131Hh appRepository) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        this.a = appData;
        this.b = subIdProvider;
        this.c = appRepository;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        if (r8.g() == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.C3756fJ1 r17, defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3756fJ1.b(fJ1, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3546eJ1
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }
}
