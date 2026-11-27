package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase$updateLanguage$2", f = "ChangeLanguageViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C1496Lz extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ OR0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496Lz(OR0 or0, JM<? super C1496Lz> jm) {
        super(1, jm);
        this.d = or0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1496Lz(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C1496Lz) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        String languageTags = this.d.a.a.toLanguageTags();
        Intrinsics.checkNotNullExpressionValue(languageTags, "toLanguageTags(...)");
        return languageTags;
    }
}
