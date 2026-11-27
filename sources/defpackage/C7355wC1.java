package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7355wC1 implements InterfaceC7145vC1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C5176lq1 b;

    @NotNull
    public final AbstractC3900g02 c;

    /* JADX INFO: renamed from: wC1$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.SaveDataUseCaseBase", f = "SaveDataUseCaseBase.kt", l = {19}, m = "saveNewToken$suspendImpl")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int g;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return C7355wC1.b(C7355wC1.this, this);
        }
    }

    /* JADX INFO: renamed from: wC1$b */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.SaveDataUseCaseBase$saveNewToken$2", f = "SaveDataUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super String>, Object> {
        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C7355wC1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return C7355wC1.this.b.c;
        }
    }

    public C7355wC1(@NotNull C4923kf appData, @NotNull C5176lq1 registerAndLoginParams, @NotNull AbstractC3900g02 tokenUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(tokenUseCase, "tokenUseCase");
        this.a = appData;
        this.b = registerAndLoginParams;
        this.c = tokenUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(C7355wC1 c7355wC1, JM<? super CommonResult<?>> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = c7355wC1.new a(jm);
            }
        } else {
            aVar = c7355wC1.new a(jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = c7355wC1.a.f;
            C6315rG c6315rG = new C6315rG(c7355wC1.b.c);
            gp1.getClass();
            gp1.m(null, c6315rG);
            b bVar = c7355wC1.new b(null);
            aVar.g = 1;
            if (c7355wC1.c.l(bVar, aVar) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return new ResultOk(Unit.a);
    }

    @Override // defpackage.InterfaceC7145vC1
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }
}
