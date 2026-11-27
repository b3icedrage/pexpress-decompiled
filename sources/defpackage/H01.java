package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LH01;", "", "LD01;", "model", "", "path", "property", "oldValue", "newValue", "<init>", "(LD01;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "LD01;", "getModel", "()LD01;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "getProperty", "Ljava/lang/Object;", "getOldValue", "()Ljava/lang/Object;", "getNewValue", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class H01 {

    @NotNull
    private final D01 model;

    @Nullable
    private final Object newValue;

    @Nullable
    private final Object oldValue;

    @NotNull
    private final String path;

    @NotNull
    private final String property;

    public H01(@NotNull D01 model, @NotNull String path, @NotNull String property, @Nullable Object obj, @Nullable Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        this.model = model;
        this.path = path;
        this.property = property;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    @NotNull
    public final D01 getModel() {
        return this.model;
    }

    @Nullable
    public final Object getNewValue() {
        return this.newValue;
    }

    @Nullable
    public final Object getOldValue() {
        return this.oldValue;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getProperty() {
        return this.property;
    }
}
