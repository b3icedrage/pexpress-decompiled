package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase$getPlatformTime$2", f = "AppRepositoryBase.kt", l = {51, 51}, m = "invokeSuspend")
public final class C1757Ph extends AW1 implements Function1<JM<? super Long>, Object> {
    public int d;
    public final /* synthetic */ AbstractC1991Sh e;

    /* JADX INFO: renamed from: Ph$a */
    public static final class a implements InterfaceC6396rf0<CommonResult<? extends Long>> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: Ph$a$a, reason: collision with other inner class name */
        public static final class C0118a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Ph$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase$getPlatformTime$2$invokeSuspend$$inlined$map$1$2", f = "AppRepositoryBase.kt", l = {219}, m = "emit")
            public static final class C0119a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0119a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0118a.this.a(null, this);
                }
            }

            public C0118a(InterfaceC6606sf0 interfaceC6606sf0) {
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
                C0119a c0119a;
                if (jm instanceof C0119a) {
                    c0119a = (C0119a) jm;
                    int i = c0119a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0119a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0119a = new C0119a(jm);
                    }
                } else {
                    c0119a = new C0119a(jm);
                }
                Object obj2 = c0119a.d;
                MN mn = MN.d;
                int i2 = c0119a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Object resultError = (CommonResult) obj;
                    if (resultError instanceof ResultOk) {
                        Long l = (Long) ((InterfaceC1247It1) ((ResultOk) resultError).a()).a();
                        resultError = l == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(l);
                    } else if (!(resultError instanceof ResultError)) {
                        throw new C6489s51();
                    }
                    c0119a.e = 1;
                    if (this.d.a(resultError, c0119a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super CommonResult<? extends Long>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0118a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757Ph(AbstractC1991Sh abstractC1991Sh, JM<? super C1757Ph> jm) {
        super(1, jm);
        this.e = abstractC1991Sh;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1757Ph(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((C1757Ph) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            MN r0 = defpackage.MN.d
            int r1 = r4.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r5)
            goto L3c
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            defpackage.C1795Pt1.b(r5)
            goto L2c
        L1c:
            defpackage.C1795Pt1.b(r5)
            Sh r5 = r4.e
            wf r5 = r5.b
            r4.d = r3
            fC1 r5 = r5.g()
            if (r5 != r0) goto L2c
            goto L3b
        L2c:
            rf0 r5 = (defpackage.InterfaceC6396rf0) r5
            Ph$a r1 = new Ph$a
            r1.<init>(r5)
            r4.d = r2
            java.lang.Object r5 = defpackage.C4466ii.o(r1, r4)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            com.api.core.backend.domain.models.resultModels.CommonResult r5 = (com.api.core.backend.domain.models.resultModels.CommonResult) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r5 = com.api.core.backend.domain.models.resultModels.CommonResultKt.b(r5)
            if (r5 == 0) goto L4a
            return r5
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "No result as this is ResultError"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1757Ph.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
