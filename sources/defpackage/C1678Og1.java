package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Og1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1678Og1 implements InterfaceC1442Lg1 {

    @NotNull
    public final ES<AbstractC0662Bg1> a;

    /* JADX INFO: renamed from: Og1$a */
    @InterfaceC3368dU(c = "com.base.feature.preferences.domain.repository.PreferencesRepositoryBase$insert$2", f = "PreferencesRepositoryBase.kt", l = {29}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Y11, JM<? super Unit>, Object> {
        public AbstractC0662Bg1.a d;
        public int e;
        public /* synthetic */ Object g;
        public final /* synthetic */ InterfaceC7031ug1<T> h;
        public final /* synthetic */ Object i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7031ug1<T> interfaceC7031ug1, Function1<? super JM<? super T>, ? extends Object> function1, JM<? super a> jm) {
            super(2, jm);
            this.h = interfaceC7031ug1;
            this.i = function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.h, this.i, jm);
            aVar.g = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Y11 y11, JM<? super Unit> jm) {
            return ((a) create(y11, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Y11 y11;
            AbstractC0662Bg1.a<?> key;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                y11 = (Y11) this.g;
                AbstractC0662Bg1.a<?> key2 = this.h.getKey();
                this.g = y11;
                this.d = key2;
                this.e = 1;
                Object objInvoke = this.i.invoke(this);
                if (objInvoke == mn) {
                    return mn;
                }
                key = key2;
                obj = objInvoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                key = this.d;
                y11 = (Y11) this.g;
                C1795Pt1.b(obj);
            }
            y11.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            y11.d(key, obj);
            return Unit.a;
        }
    }

    public C1678Og1(@NotNull ES<AbstractC0662Bg1> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
    }

    @Override // defpackage.InterfaceC1442Lg1
    @NotNull
    public final <T> InterfaceC6396rf0<T> a(@NotNull InterfaceC7031ug1<T> prefsKey) {
        Intrinsics.checkNotNullParameter(prefsKey, "prefsKey");
        InterfaceC6396rf0<AbstractC0662Bg1> data = this.a.getData();
        return C4466ii.m(new C1912Rg1(new C1282Jf0(data, new C1990Sg1(3, null)), new C1519Mg1(prefsKey, 0), 0));
    }

    @Override // defpackage.InterfaceC1442Lg1
    @Nullable
    public final <T> Object b(@NotNull InterfaceC7031ug1<T> interfaceC7031ug1, @NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return C2224Vg1.a(this.a, new a(interfaceC7031ug1, function1, null), jm);
    }

    @Override // defpackage.InterfaceC1442Lg1
    @Nullable
    public final Object c(@NotNull Set set, @NotNull LM lm) {
        return C2224Vg1.a(this.a, new C1756Pg1(set, null), lm);
    }

    @Override // defpackage.InterfaceC1442Lg1
    @NotNull
    public final <T> InterfaceC6396rf0<T> d(@NotNull final InterfaceC7031ug1<T> prefsKey, final T t) {
        Intrinsics.checkNotNullParameter(prefsKey, "prefsKey");
        InterfaceC6396rf0<AbstractC0662Bg1> data = this.a.getData();
        return C4466ii.m(new C1912Rg1(new C1282Jf0(data, new C1990Sg1(3, null)), new Function1() { // from class: Ng1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC0662Bg1 safeGet = (AbstractC0662Bg1) obj;
                Intrinsics.checkNotNullParameter(safeGet, "$this$safeGet");
                Object objB = safeGet.b(prefsKey.getKey());
                return objB == null ? t : objB;
            }
        }, 0));
    }
}
