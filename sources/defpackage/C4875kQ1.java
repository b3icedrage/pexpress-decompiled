package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4875kQ1 implements InterfaceC4407iQ1 {

    @NotNull
    public final C3501e6 a;

    @NotNull
    public final InterfaceC5862p6 b;

    @NotNull
    public final C6610sg0 c;

    /* JADX INFO: renamed from: kQ1$a */
    @InterfaceC3368dU(c = "com.base.feature.activation.providers.StepDescriptionProviderBase$minDepositValue$1", f = "StepDescriptionProviderBase.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<FF, C6945uG, JM<? super String>, Object> {
        public InterfaceC3170cY d;
        public int e;
        public final /* synthetic */ InterfaceC3170cY g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3170cY interfaceC3170cY, JM<? super a> jm) {
            super(3, jm);
            this.g = interfaceC3170cY;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            InterfaceC3170cY interfaceC3170cY;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC3170cY interfaceC3170cY2 = this.g;
                this.d = interfaceC3170cY2;
                this.e = 1;
                Object objA = interfaceC3170cY2.a(null, this);
                if (objA == mn) {
                    return mn;
                }
                interfaceC3170cY = interfaceC3170cY2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3170cY = this.d;
                C1795Pt1.b(obj);
            }
            return interfaceC3170cY.d(((Number) obj).intValue());
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(FF ff, C6945uG c6945uG, JM<? super String> jm) {
            return new a(this.g, jm).invokeSuspend(Unit.a);
        }
    }

    public C4875kQ1(@NotNull C4923kf appDataRepository, @NotNull InterfaceC3170cY depositValuesProvider, @NotNull C3501e6 imagesUrlProvider, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        Intrinsics.checkNotNullParameter(imagesUrlProvider, "imagesUrlProvider");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.a = imagesUrlProvider;
        this.b = activationStateProviderApi;
        this.c = new C6610sg0(new C4250hg0(appDataRepository.b, 0), appDataRepository.k, new a(depositValuesProvider, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object b(C4875kQ1 c4875kQ1, LM lm) {
        C5085lQ1 c5085lQ1;
        int i;
        String str;
        List list;
        int i2;
        Object[] objArr;
        Object[] objArr2;
        int i3;
        C4875kQ1 c4875kQ2 = c4875kQ1;
        c4875kQ2.getClass();
        if (lm instanceof C5085lQ1) {
            c5085lQ1 = (C5085lQ1) lm;
            int i4 = c5085lQ1.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c5085lQ1.n = i4 - Integer.MIN_VALUE;
            } else {
                c5085lQ1 = new C5085lQ1(c4875kQ2, lm);
            }
        } else {
            c5085lQ1 = new C5085lQ1(c4875kQ2, lm);
        }
        Object obj = c5085lQ1.l;
        MN mn = MN.d;
        int i5 = c5085lQ1.n;
        int i6 = 1;
        if (i5 == 0) {
            C1795Pt1.b(obj);
            c4875kQ2.a.getClass();
            c5085lQ1.d = c4875kQ2;
            c5085lQ1.e = "https://assets.pbotservices.com/images/activation-steps/deposit.png";
            i = R.string.activation_banner_make_deposit_title;
            c5085lQ1.i = R.string.activation_banner_make_deposit_title;
            c5085lQ1.n = 1;
            Object objO = C4466ii.o(c4875kQ2.c, c5085lQ1);
            if (objO != mn) {
                str = "https://assets.pbotservices.com/images/activation-steps/deposit.png";
                obj = objO;
            }
            return mn;
        }
        if (i5 == 1) {
            int i7 = c5085lQ1.i;
            String str2 = c5085lQ1.e;
            C4875kQ1 c4875kQ3 = (C4875kQ1) c5085lQ1.d;
            C1795Pt1.b(obj);
            i = i7;
            c4875kQ2 = c4875kQ3;
            str = str2;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = c5085lQ1.k;
            int i8 = c5085lQ1.j;
            int i9 = c5085lQ1.i;
            objArr2 = c5085lQ1.h;
            List list2 = c5085lQ1.g;
            str = c5085lQ1.e;
            objArr = (Object[]) c5085lQ1.d;
            C1795Pt1.b(obj);
            i3 = i8;
            i2 = i9;
            list = list2;
        }
        String str3 = str;
        objArr2[i6] = obj;
        return new DY(str3, i2, list, i3, WE.f(objArr));
        List listC = VE.c(obj);
        Object[] objArr3 = new Object[2];
        objArr3[0] = new Integer(R.string.platform_name);
        C6610sg0 c6610sg0 = c4875kQ2.c;
        c5085lQ1.d = objArr3;
        c5085lQ1.e = str;
        c5085lQ1.g = listC;
        c5085lQ1.h = objArr3;
        c5085lQ1.i = i;
        c5085lQ1.j = R.string.make_a_deposit_description;
        c5085lQ1.k = 1;
        c5085lQ1.n = 2;
        Object objO2 = C4466ii.o(c6610sg0, c5085lQ1);
        if (objO2 != mn) {
            list = listC;
            i2 = i;
            objArr = objArr3;
            objArr2 = objArr;
            i3 = R.string.make_a_deposit_description;
            obj = objO2;
            String str4 = str;
            objArr2[i6] = obj;
            return new DY(str4, i2, list, i3, WE.f(objArr));
        }
        return mn;
    }

    @Override // defpackage.InterfaceC4407iQ1
    @NotNull
    public final C4250hg0 a() {
        return new C4250hg0(new C6610sg0(this.b.a(), this.c, new C4665jQ1(this, null)), 0);
    }
}
