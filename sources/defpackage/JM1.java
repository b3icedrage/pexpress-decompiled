package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.D01;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006%"}, d2 = {"LJM1;", "LD01;", "TModel", "LTu0;", "Lcs0;", "Ljava/io/Closeable;", "LSu0;", Payload.TYPE_STORE, "Lfu0;", "opRepo", "<init>", "(LSu0;Lfu0;)V", "", "bootstrap", "()V", "close", "model", "", "tag", "onModelReplaced", "(LD01;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "LQ91;", "getReplaceOperation", "(LD01;)LQ91;", "path", "property", "", "oldValue", "newValue", "getUpdateOperation", "(LD01;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)LQ91;", "LSu0;", "Lfu0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class JM1<TModel extends D01> implements InterfaceC2109Tu0<TModel>, InterfaceC3244cs0, Closeable {

    @NotNull
    private final InterfaceC3879fu0 opRepo;

    @NotNull
    private final InterfaceC2031Su0<TModel> store;

    public JM1(@NotNull InterfaceC2031Su0<TModel> store, @NotNull InterfaceC3879fu0 opRepo) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        this.store = store;
        this.opRepo = opRepo;
    }

    @Override // defpackage.InterfaceC3244cs0
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    @Nullable
    public abstract Q91 getReplaceOperation(@NotNull TModel model);

    @Nullable
    public abstract Q91 getUpdateOperation(@NotNull TModel model, @NotNull String path, @NotNull String property, @Nullable Object oldValue, @Nullable Object newValue);

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelReplaced(@NotNull TModel model, @NotNull String tag) {
        Q91 replaceOperation;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL") && (replaceOperation = getReplaceOperation(model)) != null) {
            InterfaceC3879fu0.a.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            D01 model = args.getModel();
            Intrinsics.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            Q91 updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                InterfaceC3879fu0.a.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
