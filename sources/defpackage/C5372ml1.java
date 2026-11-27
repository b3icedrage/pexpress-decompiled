package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ml1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lml1;", "LuU1;", "Lwu0;", "LAU1;", "model", "<init>", "(LAU1;)V", "Lol1;", "fetchState", "()Lol1;", "", "optIn", "()V", "optOut", "Lxu0;", "observer", "addObserver", "(Lxu0;)V", "removeObserver", "refreshState", "LO80;", "changeHandlersNotifier", "LO80;", "getChangeHandlersNotifier", "()LO80;", "<set-?>", "savedState", "Lol1;", "getSavedState", "", "getToken", "()Ljava/lang/String;", "token", "", "getOptedIn", "()Z", "optedIn", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C5372ml1 extends AbstractC6989uU1 implements InterfaceC7500wu0 {

    @NotNull
    private final O80<InterfaceC7710xu0> changeHandlersNotifier;

    @NotNull
    private C5792ol1 savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5372ml1(@NotNull AU1 model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
        this.changeHandlersNotifier = new O80<>();
        this.savedState = fetchState();
    }

    private final C5792ol1 fetchState() {
        return new C5792ol1(getId(), getToken(), getOptedIn());
    }

    @Override // defpackage.InterfaceC7500wu0
    public void addObserver(@NotNull InterfaceC7710xu0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @NotNull
    public final O80<InterfaceC7710xu0> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // defpackage.InterfaceC7500wu0
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != GU1.NO_PERMISSION;
    }

    @NotNull
    public final C5792ol1 getSavedState() {
        return this.savedState;
    }

    @Override // defpackage.InterfaceC7500wu0
    @NotNull
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // defpackage.InterfaceC7500wu0
    public void optIn() {
        D01.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // defpackage.InterfaceC7500wu0
    public void optOut() {
        getModel().setOptedIn(false);
    }

    @NotNull
    public final C5792ol1 refreshState() {
        C5792ol1 c5792ol1FetchState = fetchState();
        this.savedState = c5792ol1FetchState;
        return c5792ol1FetchState;
    }

    @Override // defpackage.InterfaceC7500wu0
    public void removeObserver(@NotNull InterfaceC7710xu0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
