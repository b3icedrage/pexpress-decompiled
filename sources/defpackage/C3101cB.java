package defpackage;

import com.jivosite.sdk.model.pojo.CustomData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$sendCustomData$2", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
public final class C3101cB extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ List<CustomData> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3101cB(List<CustomData> list, JM<? super C3101cB> jm) {
        super(2, jm);
        this.d = list;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3101cB(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3101cB) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C4201hS c4201hS = C6104qF0.a;
        List<CustomData> customDataFields = this.d;
        Intrinsics.checkNotNullParameter(customDataFields, "customDataFields");
        if (C6104qF0.a != null) {
            ((InterfaceC7170vL) ((C4201hS) C6104qF0.d()).z.get()).M(customDataFields);
        }
        return Unit.a;
    }
}
