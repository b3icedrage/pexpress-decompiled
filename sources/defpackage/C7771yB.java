package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.CheckForUpdatesUseCaseBase", f = "CheckForUpdatesUseCaseBase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, 115}, m = "execute")
public final class C7771yB extends LM {
    public C7981zB d;
    public CommonError e;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C7981zB n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7771yB(C7981zB c7981zB, LM lm) {
        super(lm);
        this.n = c7981zB;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}
