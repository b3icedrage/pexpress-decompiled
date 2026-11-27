package defpackage;

import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import java.util.Set;

/* JADX INFO: renamed from: z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7954z4 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C7954z4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountSettingsPartBase((Sd2) ((OW) this.b).get(), new C5829ox0());
            case 1:
                return new C5412my0((Set) ((C4176hJ1) this.b).get());
            default:
                return new C2877b7(C7652xe.f(((BV0) this.b).a));
        }
    }
}
