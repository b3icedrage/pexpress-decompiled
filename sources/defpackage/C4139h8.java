package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AddUserUseCaseBaseKt", f = "AddUserUseCaseBase.kt", l = {60, 115}, m = "addUserWithRetry-KLykuaI")
public final class C4139h8 extends LM {
    public long d;
    public long e;
    public long g;
    public long h;
    public Function1 i;
    public String j;
    public CommonError k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public int o;

    public C4139h8() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.n = obj;
        this.o |= Integer.MIN_VALUE;
        return C4349i8.a(0L, null, this);
    }
}
