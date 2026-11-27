package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class QQ implements InterfaceC6353rS1 {

    @NotNull
    public final RL0 a;

    @NotNull
    public final EnumC2694aJ1 b;

    @NotNull
    public final C3735fC1 c;

    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.CurrentLanguageSessionValue$valueFlow$1", f = "CurrentLanguageSessionValue.kt", l = {16}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super String>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = QQ.this.new a(jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super String> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
                String str = QQ.this.a.defaultValue().g;
                this.d = 1;
                if (interfaceC6606sf0.a(str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public QQ(@NotNull RL0 languageList) {
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        this.a = languageList;
        this.b = EnumC2694aJ1.LANGUAGE_KEY;
        this.c = new C3735fC1(new a(null));
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.c;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.b;
    }
}
