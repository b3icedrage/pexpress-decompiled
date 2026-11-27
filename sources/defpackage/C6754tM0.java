package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.google.gson.Gson;
import com.impl.core.backend.responseModels.Deposit;
import com.impl.core.backend.responseModels.DepositHistoryResponse;
import com.impl.core.backend.responseModels.DepositStatus;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6754tM0 extends AbstractC7452wg1<String> {

    @NotNull
    public final C2750ab2 d;

    @NotNull
    public final AbstractC0662Bg1.a<String> e;

    @NotNull
    public final Gson f;

    @NotNull
    public final a g;

    /* JADX INFO: renamed from: tM0$a */
    public static final class a implements InterfaceC6396rf0<Deposit> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ C6754tM0 e;

        /* JADX INFO: renamed from: tM0$a$a, reason: collision with other inner class name */
        public static final class C0494a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C6754tM0 e;

            /* JADX INFO: renamed from: tM0$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.core.backend.usecases.LastDepositUseCaseImpl$special$$inlined$map$1$2", f = "LastDepositUseCaseImpl.kt", l = {219}, m = "emit")
            public static final class C0495a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0495a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0494a.this.a(null, this);
                }
            }

            public C0494a(InterfaceC6606sf0 interfaceC6606sf0, C6754tM0 c6754tM0) {
                this.d = interfaceC6606sf0;
                this.e = c6754tM0;
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
                C0495a c0495a;
                Object objA;
                if (jm instanceof C0495a) {
                    c0495a = (C0495a) jm;
                    int i = c0495a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0495a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0495a = new C0495a(jm);
                    }
                } else {
                    c0495a = new C0495a(jm);
                }
                Object obj2 = c0495a.d;
                MN mn = MN.d;
                int i2 = c0495a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    String str = (String) obj;
                    Object obj3 = null;
                    if (str != null) {
                        C6754tM0 c6754tM0 = this.e;
                        try {
                            C1717Ot1.a aVar = C1717Ot1.e;
                            objA = (Deposit) c6754tM0.f.d(Deposit.class, str);
                        } catch (Throwable th) {
                            C1717Ot1.a aVar2 = C1717Ot1.e;
                            objA = C1795Pt1.a(th);
                        }
                        obj3 = (Deposit) (objA instanceof C1717Ot1.b ? null : objA);
                    }
                    c0495a.e = 1;
                    if (this.d.a(obj3, c0495a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0, C6754tM0 c6754tM0) {
            this.d = interfaceC6396rf0;
            this.e = c6754tM0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Deposit> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0494a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6754tM0(@NotNull C2750ab2 userDataSource, @NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(userDataSource, "userDataSource");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = userDataSource;
        this.e = C1052Gg1.d("last_deposit_in_history");
        this.f = new Gson();
        this.g = new a(k(), this);
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull LM lm) {
        C5705oM0 c5705oM0;
        List<Deposit> listA;
        List listZ;
        if (lm instanceof C5705oM0) {
            c5705oM0 = (C5705oM0) lm;
            int i = c5705oM0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5705oM0.g = i - Integer.MIN_VALUE;
            } else {
                c5705oM0 = new C5705oM0(this, lm);
            }
        } else {
            c5705oM0 = new C5705oM0(this, lm);
        }
        Object objE = c5705oM0.d;
        MN mn = MN.d;
        int i2 = c5705oM0.g;
        Object obj = null;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            c5705oM0.g = 1;
            C2750ab2 c2750ab2 = this.d;
            c2750ab2.getClass();
            objE = c2750ab2.b.e(new C2974bb2(c2750ab2, null), c5705oM0);
            if (objE == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
        }
        DepositHistoryResponse depositHistoryResponse = (DepositHistoryResponse) CommonResultKt.b((CommonResult) objE);
        if (depositHistoryResponse == null || (listA = depositHistoryResponse.a()) == null || (listZ = CollectionsKt.Z(listA, new C5495nM0())) == null) {
            return null;
        }
        for (Object obj2 : listZ) {
            if (((Deposit) obj2).getStatus() == DepositStatus.Pending) {
                obj = obj2;
                break;
            }
        }
        return (Deposit) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object n(@NotNull LM lm) {
        C6125qM0 c6125qM0;
        List<Deposit> listA;
        List listZ;
        if (lm instanceof C6125qM0) {
            c6125qM0 = (C6125qM0) lm;
            int i = c6125qM0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6125qM0.g = i - Integer.MIN_VALUE;
            } else {
                c6125qM0 = new C6125qM0(this, lm);
            }
        } else {
            c6125qM0 = new C6125qM0(this, lm);
        }
        Object objE = c6125qM0.d;
        MN mn = MN.d;
        int i2 = c6125qM0.g;
        Object obj = null;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            c6125qM0.g = 1;
            C2750ab2 c2750ab2 = this.d;
            c2750ab2.getClass();
            objE = c2750ab2.b.e(new C2974bb2(c2750ab2, null), c6125qM0);
            if (objE == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
        }
        DepositHistoryResponse depositHistoryResponse = (DepositHistoryResponse) CommonResultKt.b((CommonResult) objE);
        if (depositHistoryResponse == null || (listA = depositHistoryResponse.a()) == null || (listZ = CollectionsKt.Z(listA, new C5915pM0())) == null) {
            return null;
        }
        for (Object obj2 : listZ) {
            if (((Deposit) obj2).getStatus() == DepositStatus.Success) {
                obj = obj2;
                break;
            }
        }
        return (Deposit) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o(@NotNull Deposit deposit, @NotNull LM lm) {
        C6334rM0 c6334rM0;
        if (lm instanceof C6334rM0) {
            c6334rM0 = (C6334rM0) lm;
            int i = c6334rM0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6334rM0.h = i - Integer.MIN_VALUE;
            } else {
                c6334rM0 = new C6334rM0(this, lm);
            }
        } else {
            c6334rM0 = new C6334rM0(this, lm);
        }
        Object obj = c6334rM0.e;
        Object obj2 = MN.d;
        int i2 = c6334rM0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C6544sM0 c6544sM0 = new C6544sM0(this, deposit, null);
            c6334rM0.d = deposit;
            c6334rM0.h = 1;
            if (l(c6544sM0, c6334rM0) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deposit = c6334rM0.d;
            C1795Pt1.b(obj);
        }
        Objects.toString(deposit);
        return Unit.a;
    }
}
