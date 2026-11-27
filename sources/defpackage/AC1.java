package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.usecases.SaveNicknameUseCaseBase", f = "SaveNicknameUseCaseBase.kt", l = {35, 37, 39}, m = "tryChangeNickname")
public final class AC1 extends LM {
    public C7986zC1 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C7986zC1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AC1(C7986zC1 c7986zC1, LM lm) {
        super(lm);
        this.h = c7986zC1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C7986zC1.b(this.h, null, this);
    }
}
