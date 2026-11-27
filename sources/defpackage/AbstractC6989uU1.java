package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LuU1;", "LZu0;", "LAU1;", "model", "<init>", "(LAU1;)V", "LAU1;", "getModel", "()LAU1;", "", "getId", "()Ljava/lang/String;", "id", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractC6989uU1 implements InterfaceC2607Zu0 {

    @NotNull
    private final AU1 model;

    public AbstractC6989uU1(@NotNull AU1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    @Override // defpackage.InterfaceC2607Zu0
    @NotNull
    public String getId() {
        return C6443rs0.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    @NotNull
    public final AU1 getModel() {
        return this.model;
    }
}
