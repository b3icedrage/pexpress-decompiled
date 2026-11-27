package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.graphic.usecases.SubscribeToValueUpdatesUseCaseBase", f = "SubscribeToValueUpdatesUseCaseBase.kt", l = {39, UserVerificationMethods.USER_VERIFY_PATTERN, RequestError.NO_DEV_KEY}, m = "subscribeWithHistory")
public final class C5520nU1 extends LM {
    public Object d;
    public I10 e;
    public CommonError g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ C5730oU1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5520nU1(C5730oU1 c5730oU1, LM lm) {
        super(lm);
        this.p = c5730oU1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, 0, this);
    }
}
