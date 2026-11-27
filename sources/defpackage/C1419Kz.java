package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase", f = "ChangeLanguageViewModelBase.kt", l = {57, 60, 67}, m = "updateLanguage")
public final class C1419Kz extends LM {
    public C1263Iz d;
    public OR0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1263Iz h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419Kz(C1263Iz c1263Iz, LM lm) {
        super(lm);
        this.h = c1263Iz;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.l(this);
    }
}
