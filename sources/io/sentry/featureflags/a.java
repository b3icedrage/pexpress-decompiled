package io.sentry.featureflags;

import io.sentry.protocol.C4524f;
import io.sentry.protocol.C4525g;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    @NotNull
    public volatile CopyOnWriteArrayList<C0394a> a;

    /* JADX INFO: renamed from: io.sentry.featureflags.a$a, reason: collision with other inner class name */
    public static class C0394a {
    }

    public a() {
        throw null;
    }

    @Override // io.sentry.featureflags.b
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        a aVar = new a();
        new C4527a();
        aVar.a = new CopyOnWriteArrayList<>(this.a);
        return aVar;
    }

    @Override // io.sentry.featureflags.b
    @Nullable
    public final C4525g g() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0394a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            arrayList.add(new C4524f(null, false));
        }
        return new C4525g(arrayList);
    }
}
