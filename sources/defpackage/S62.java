package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S62<K, V> {

    @NotNull
    public final ConcurrentHashMap<String, Integer> a = new ConcurrentHashMap<>();

    @NotNull
    public final AtomicInteger b = new AtomicInteger(0);
}
