package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1834Qg1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ Function1 e;

    /* JADX INFO: renamed from: Qg1$a */
    @InterfaceC3368dU(c = "com.base.feature.preferences.domain.repository.PreferencesRepositoryBaseKt$safeGet$$inlined$map$1$2", f = "PreferencesRepositoryBase.kt", l = {223}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1834Qg1.this.a(null, this);
        }
    }

    public C1834Qg1(InterfaceC6606sf0 interfaceC6606sf0, Function1 function1) {
        this.d = interfaceC6606sf0;
        this.e = function1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj2 = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            Object objInvoke = this.e.invoke((AbstractC0662Bg1) obj);
            aVar.e = 1;
            if (this.d.a(objInvoke, aVar) == mn) {
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
