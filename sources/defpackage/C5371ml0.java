package defpackage;

import android.content.Context;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5371ml0 implements InterfaceC5158ll0 {

    @NotNull
    public final Context a;

    @NotNull
    public final I50 b;

    @NotNull
    public final AbstractC0578Ae1 c;

    @NotNull
    public final InterfaceC7012ub2 d;

    @NotNull
    public final C4923kf e;

    /* JADX INFO: renamed from: ml0$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.GetPlatformUserUseCaseBase", f = "GetPlatformUserUseCaseBase.kt", l = {26, 26, 29, 30}, m = "tryGetUser$suspendImpl")
    public static final class a extends LM {
        public C5371ml0 d;
        public Object e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C5371ml0.b(C5371ml0.this, this);
        }
    }

    /* JADX INFO: renamed from: ml0$b */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.GetPlatformUserUseCaseBase$tryGetUser$2", f = "GetPlatformUserUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super String>, Object> {
        public final /* synthetic */ ResultOk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ResultOk resultOk, JM jm) {
            super(1, jm);
            this.d = resultOk;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new b(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return ((C6945uG) this.d.a()).b;
        }
    }

    /* JADX INFO: renamed from: ml0$c */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.GetPlatformUserUseCaseBase$tryGetUser$3", f = "GetPlatformUserUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Long>, Object> {
        public final /* synthetic */ CommonResult<C6945uG> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CommonResult<C6945uG> commonResult, JM<? super c> jm) {
            super(1, jm);
            this.d = commonResult;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new c(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Long> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return new Long(((C6945uG) ((ResultOk) this.d).a()).a);
        }
    }

    public C5371ml0(@NotNull Context applicationContext, @NotNull I50 emailUseCase, @NotNull AbstractC0578Ae1 platformIdUseCaseApi, @NotNull InterfaceC7012ub2 userRepository, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        Intrinsics.checkNotNullParameter(platformIdUseCaseApi, "platformIdUseCaseApi");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = applicationContext;
        this.b = emailUseCase;
        this.c = platformIdUseCaseApi;
        this.d = userRepository;
        this.e = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(C5371ml0 c5371ml0, JM<? super CommonResult<C6945uG>> jm) {
        a aVar;
        C5371ml0 c5371ml1;
        InterfaceC7012ub2 interfaceC7012ub2;
        C5371ml0 c5371ml2;
        CommonResult commonResult;
        b bVar;
        C5371ml0 c5371ml3;
        CommonResult commonResult2;
        AbstractC0578Ae1 abstractC0578Ae1;
        c cVar;
        C5371ml0 c5371ml4;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.i = i - Integer.MIN_VALUE;
            } else {
                aVar = c5371ml0.new a(jm);
            }
        } else {
            aVar = c5371ml0.new a(jm);
        }
        Object objK = aVar.g;
        MN mn = MN.d;
        int i2 = aVar.i;
        if (i2 == 0) {
            C1795Pt1.b(objK);
            InterfaceC7012ub2 interfaceC7012ub3 = c5371ml0.d;
            GP1 gp1 = c5371ml0.e.f;
            aVar.d = c5371ml0;
            aVar.e = interfaceC7012ub3;
            aVar.i = 1;
            Object objA = C7236vf0.a(gp1, aVar);
            if (objA != mn) {
                c5371ml1 = c5371ml0;
                interfaceC7012ub2 = interfaceC7012ub3;
                objK = objA;
            }
            return mn;
        }
        if (i2 == 1) {
            interfaceC7012ub2 = (InterfaceC7012ub2) aVar.e;
            c5371ml1 = aVar.d;
            C1795Pt1.b(objK);
        } else {
            if (i2 == 2) {
                c5371ml2 = aVar.d;
                C1795Pt1.b(objK);
                commonResult = (CommonResult) objK;
                if (commonResult instanceof ResultOk) {
                    return commonResult;
                }
                c5371ml2.e.k.setValue((C6945uG) ((ResultOk) commonResult).a());
                bVar = new b((ResultOk) commonResult, null);
                aVar.d = c5371ml2;
                aVar.e = commonResult;
                aVar.i = 3;
                if (c5371ml2.b.l(bVar, aVar) != mn) {
                    c5371ml3 = c5371ml2;
                    commonResult2 = commonResult;
                    abstractC0578Ae1 = c5371ml3.c;
                    cVar = new c(commonResult2, null);
                    aVar.d = c5371ml3;
                    aVar.e = commonResult2;
                    aVar.i = 4;
                    if (abstractC0578Ae1.l(cVar, aVar) != mn) {
                        c5371ml4 = c5371ml3;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                commonResult2 = (CommonResult) aVar.e;
                c5371ml3 = aVar.d;
                C1795Pt1.b(objK);
                abstractC0578Ae1 = c5371ml3.c;
                cVar = new c(commonResult2, null);
                aVar.d = c5371ml3;
                aVar.e = commonResult2;
                aVar.i = 4;
                if (abstractC0578Ae1.l(cVar, aVar) != mn) {
                    c5371ml4 = c5371ml3;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonResult2 = (CommonResult) aVar.e;
            c5371ml4 = aVar.d;
            C1795Pt1.b(objK);
        }
        String avatarUrl = ((C6945uG) ((ResultOk) commonResult2).a()).p;
        c5371ml4.getClass();
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        c5371ml4.e.l.setValue(avatarUrl);
        KW1 kw1 = C3435dm0.a;
        EnumC7035uh1 priority = EnumC7035uh1.h;
        Context context = c5371ml4.a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        C6025ps1 c6025ps1V = com.bumptech.glide.a.c(context).n(avatarUrl).v(priority);
        c6025ps1V.getClass();
        c6025ps1V.M(new C2566Zg1(c6025ps1V.y), null, c6025ps1V, C3387da0.a);
        return commonResult2;
        aVar.d = c5371ml1;
        aVar.e = null;
        aVar.i = 2;
        objK = interfaceC7012ub2.k((C6315rG) objK, aVar);
        if (objK != mn) {
            c5371ml2 = c5371ml1;
            commonResult = (CommonResult) objK;
            if (commonResult instanceof ResultOk) {
                return commonResult;
            }
            c5371ml2.e.k.setValue((C6945uG) ((ResultOk) commonResult).a());
            bVar = new b((ResultOk) commonResult, null);
            aVar.d = c5371ml2;
            aVar.e = commonResult;
            aVar.i = 3;
            if (c5371ml2.b.l(bVar, aVar) != mn) {
                c5371ml3 = c5371ml2;
                commonResult2 = commonResult;
                abstractC0578Ae1 = c5371ml3.c;
                cVar = new c(commonResult2, null);
                aVar.d = c5371ml3;
                aVar.e = commonResult2;
                aVar.i = 4;
                if (abstractC0578Ae1.l(cVar, aVar) != mn) {
                    c5371ml4 = c5371ml3;
                    String avatarUrl2 = ((C6945uG) ((ResultOk) commonResult2).a()).p;
                    c5371ml4.getClass();
                    Intrinsics.checkNotNullParameter(avatarUrl2, "avatarUrl");
                    c5371ml4.e.l.setValue(avatarUrl2);
                    KW1 kw2 = C3435dm0.a;
                    EnumC7035uh1 priority2 = EnumC7035uh1.h;
                    Context context2 = c5371ml4.a;
                    Intrinsics.checkNotNullParameter(context2, "<this>");
                    Intrinsics.checkNotNullParameter(priority2, "priority");
                    C6025ps1 c6025ps1V2 = com.bumptech.glide.a.c(context2).n(avatarUrl2).v(priority2);
                    c6025ps1V2.getClass();
                    c6025ps1V2.M(new C2566Zg1(c6025ps1V2.y), null, c6025ps1V2, C3387da0.a);
                    return commonResult2;
                }
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC5158ll0
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }
}
