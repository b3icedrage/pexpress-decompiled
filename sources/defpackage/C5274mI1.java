package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LmI1;", "LNu0;", "<init>", "()V", "", "T", "LuI1;", "register", "()LuI1;", "Ljava/lang/Class;", "c", "(Ljava/lang/Class;)LuI1;", "Lkotlin/Function1;", "LOu0;", "create", "(Lkotlin/jvm/functions/Function1;)LuI1;", "obj", "(Ljava/lang/Object;)LuI1;", "LtI1;", "build", "()LtI1;", "", "registrations", "Ljava/util/List;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5274mI1 implements InterfaceC1641Nu0 {

    @NotNull
    private final List<AbstractC6953uI1<?>> registrations = new ArrayList();

    @Override // defpackage.InterfaceC1641Nu0
    @NotNull
    public C6743tI1 build() {
        return new C6743tI1(this.registrations);
    }

    public final /* synthetic */ <T> AbstractC6953uI1<T> register() {
        Intrinsics.h();
        throw null;
    }

    @Override // defpackage.InterfaceC1641Nu0
    @NotNull
    public <T> AbstractC6953uI1<T> register(@NotNull Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        C7374wI1 c7374wI1 = new C7374wI1(c);
        this.registrations.add(c7374wI1);
        return c7374wI1;
    }

    @Override // defpackage.InterfaceC1641Nu0
    @NotNull
    public <T> AbstractC6953uI1<T> register(@NotNull Function1<? super InterfaceC1719Ou0, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        C7163vI1 c7163vI1 = new C7163vI1(create);
        this.registrations.add(c7163vI1);
        return c7163vI1;
    }

    @Override // defpackage.InterfaceC1641Nu0
    @NotNull
    public <T> AbstractC6953uI1<T> register(T obj) {
        C7584xI1 c7584xI1 = new C7584xI1(obj);
        this.registrations.add(c7584xI1);
        return c7584xI1;
    }
}
