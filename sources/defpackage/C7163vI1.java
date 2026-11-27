package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LvI1;", "T", "LuI1;", "Lkotlin/Function1;", "LOu0;", "create", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "provider", "", "resolve", "(LOu0;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "obj", "Ljava/lang/Object;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7163vI1<T> extends AbstractC6953uI1<T> {

    @NotNull
    private final Function1<InterfaceC1719Ou0, T> create;

    @Nullable
    private T obj;

    /* JADX WARN: Multi-variable type inference failed */
    public C7163vI1(@NotNull Function1<? super InterfaceC1719Ou0, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        this.create = create;
    }

    @Override // defpackage.AbstractC6953uI1
    @Nullable
    public Object resolve(@NotNull InterfaceC1719Ou0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        T t = this.obj;
        if (t != null) {
            return t;
        }
        T tInvoke = this.create.invoke(provider);
        this.obj = tInvoke;
        return tInvoke;
    }
}
