package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8142zy0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ AbstractC0637Ay0 e;

    /* JADX INFO: renamed from: zy0$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.indicators.IndicatorParamsProvider$prefsFlow$$inlined$map$1$2", f = "IndicatorParamsProvider.kt", l = {219}, m = "emit")
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
            return C8142zy0.this.a(null, this);
        }
    }

    public C8142zy0(InterfaceC6606sf0 interfaceC6606sf0, AbstractC0637Ay0 abstractC0637Ay0) {
        this.d = interfaceC6606sf0;
        this.e = abstractC0637Ay0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        InterfaceC7722xy0 interfaceC7722xy0;
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
            String str = (String) obj;
            if (str != null) {
                AbstractC0637Ay0 abstractC0637Ay0 = this.e;
                interfaceC7722xy0 = (InterfaceC7722xy0) C3476e.i(abstractC0637Ay0.b, str, abstractC0637Ay0.a());
            } else {
                interfaceC7722xy0 = null;
            }
            aVar.e = 1;
            if (this.d.a(interfaceC7722xy0, aVar) == mn) {
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
