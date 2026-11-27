package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001d"}, d2 = {"LyU1;", "", "", "LZu0;", "collection", "Lwu0;", "_fallbackPushSub", "<init>", "(Ljava/util/List;Lwu0;)V", "", "email", "LAs0;", "getByEmail", "(Ljava/lang/String;)LAs0;", "sms", "LUu0;", "getBySMS", "(Ljava/lang/String;)LUu0;", "Ljava/util/List;", "getCollection", "()Ljava/util/List;", "Lwu0;", "getPush", "()Lwu0;", "push", "getEmails", "emails", "getSmss", "smss", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7830yU1 {

    @NotNull
    private final InterfaceC7500wu0 _fallbackPushSub;

    @NotNull
    private final List<InterfaceC2607Zu0> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public C7830yU1(@NotNull List<? extends InterfaceC2607Zu0> collection, @NotNull InterfaceC7500wu0 _fallbackPushSub) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    @Nullable
    public final InterfaceC0619As0 getByEmail(@NotNull String email) {
        Object next;
        Intrinsics.checkNotNullParameter(email, "email");
        Iterator<T> it = getEmails().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((InterfaceC0619As0) next).getEmail(), email)) {
                return (InterfaceC0619As0) next;
            }
        }
        next = null;
        return (InterfaceC0619As0) next;
    }

    @Nullable
    public final InterfaceC2187Uu0 getBySMS(@NotNull String sms) {
        Object next;
        Intrinsics.checkNotNullParameter(sms, "sms");
        Iterator<T> it = getSmss().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((InterfaceC2187Uu0) next).getNumber(), sms)) {
                return (InterfaceC2187Uu0) next;
            }
        }
        next = null;
        return (InterfaceC2187Uu0) next;
    }

    @NotNull
    public final List<InterfaceC2607Zu0> getCollection() {
        return this.collection;
    }

    @NotNull
    public final List<InterfaceC0619As0> getEmails() {
        List<InterfaceC2607Zu0> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0619As0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final InterfaceC7500wu0 getPush() {
        List<InterfaceC2607Zu0> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC7500wu0) {
                arrayList.add(obj);
            }
        }
        InterfaceC7500wu0 interfaceC7500wu0 = (InterfaceC7500wu0) CollectionsKt.firstOrNull(arrayList);
        return interfaceC7500wu0 == null ? this._fallbackPushSub : interfaceC7500wu0;
    }

    @NotNull
    public final List<InterfaceC2187Uu0> getSmss() {
        List<InterfaceC2607Zu0> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC2187Uu0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
