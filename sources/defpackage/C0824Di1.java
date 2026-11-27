package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Di1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase", f = "ProfileViewModelBase.kt", l = {155, 156}, m = "onNicknameTextChanged$suspendImpl")
public final class C0824Di1 extends LM {
    public AbstractC8090zi1 d;
    public String e;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC8090zi1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824Di1(AbstractC8090zi1 abstractC8090zi1, LM lm) {
        super(lm);
        this.i = abstractC8090zi1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC8090zi1.m(this.i, null, this);
    }
}
