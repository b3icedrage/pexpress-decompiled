package defpackage;

import com.jivosite.sdk.support.builders.ContactInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$sendContactInfo$2", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
public final class ZA extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ String d;
    public final /* synthetic */ ContactInfo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZA(String str, ContactInfo contactInfo, JM<? super ZA> jm) {
        super(2, jm);
        this.d = str;
        this.e = contactInfo;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new ZA(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((ZA) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        String userToken = this.d;
        Intrinsics.checkNotNull(userToken);
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        if (C6104qF0.a != null && !StringsKt.I(userToken)) {
            EK1 ek1 = C6104qF0.h;
            if (ek1 == null) {
                Intrinsics.l("storage");
                throw null;
            }
            IJ0<Object>[] ij0Arr = EK1.z;
            if (!userToken.equals((String) ek1.k.a(ij0Arr[11], ek1))) {
                EK1 ek2 = C6104qF0.h;
                if (ek2 == null) {
                    Intrinsics.l("storage");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(userToken, "<set-?>");
                ek2.k.b(ij0Arr[11], userToken);
            }
        }
        ContactInfo contactInfo = this.e;
        Intrinsics.checkNotNullParameter(contactInfo, "contactInfo");
        if (C6104qF0.a != null) {
            ((InterfaceC7170vL) ((C4201hS) C6104qF0.d()).z.get()).F(contactInfo);
        }
        return Unit.a;
    }
}
