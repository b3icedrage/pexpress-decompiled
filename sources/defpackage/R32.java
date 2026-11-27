package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class R32 implements InterfaceC6396rf0<CommonResult<? extends AbstractC7783yF>> {
    public final /* synthetic */ InterfaceC6396rf0 d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: R32$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.repositories.TradingRepositoryImpl$makeABet$$inlined$map$1$2", f = "TradingRepositoryImpl.kt", l = {219}, m = "emit")
        public static final class C0136a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0136a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0136a c0136a;
            if (jm instanceof C0136a) {
                c0136a = (C0136a) jm;
                int i = c0136a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0136a.e = i - Integer.MIN_VALUE;
                } else {
                    c0136a = new C0136a(jm);
                }
            } else {
                c0136a = new C0136a(jm);
            }
            Object obj2 = c0136a.d;
            MN mn = MN.d;
            int i2 = c0136a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                Object resultError = (CommonResult) obj;
                if (resultError instanceof ResultOk) {
                    AbstractC7783yF abstractC7783yF = (AbstractC7783yF) ((InterfaceC1247It1) ((ResultOk) resultError).a()).a();
                    resultError = abstractC7783yF == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(abstractC7783yF);
                } else if (!(resultError instanceof ResultError)) {
                    throw new C6489s51();
                }
                c0136a.e = 1;
                if (this.d.a(resultError, c0136a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public R32(InterfaceC6396rf0 interfaceC6396rf0) {
        this.d = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super CommonResult<? extends AbstractC7783yF>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
