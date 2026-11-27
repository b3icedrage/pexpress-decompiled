package defpackage;

import androidx.work.b;
import androidx.work.c;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8099zk2 {

    @NotNull
    public final UUID a;

    @NotNull
    public final Bk2 b;

    @NotNull
    public final Set<String> c;

    /* JADX INFO: renamed from: zk2$a */
    public static abstract class a<B extends a<B, ?>, W extends AbstractC8099zk2> {

        @NotNull
        public UUID a;

        @NotNull
        public Bk2 b;

        @NotNull
        public final Set<String> c;

        public a(@NotNull Class<? extends c> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.a = uuidRandomUUID;
            String id = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
            String workerClassName_ = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
            this.b = new Bk2(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            String[] elements = {name};
            Intrinsics.checkNotNullParameter(elements, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet(OW0.a(1));
            C1526Mj.D(elements, linkedHashSet);
            this.c = linkedHashSet;
        }

        @NotNull
        public final W a() {
            K91 k91B = b();
            VK vk = this.b.j;
            boolean z = !vk.h.isEmpty() || vk.d || vk.b || vk.c;
            Bk2 bk2 = this.b;
            if (bk2.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (bk2.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID id = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(id, "randomUUID()");
            Intrinsics.checkNotNullParameter(id, "id");
            this.a = id;
            String newId = id.toString();
            Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
            Bk2 other = this.b;
            Intrinsics.checkNotNullParameter(newId, "newId");
            Intrinsics.checkNotNullParameter(other, "other");
            String str = other.c;
            EnumC3638ek2 enumC3638ek2 = other.b;
            String str2 = other.d;
            b bVar = new b(other.e);
            b bVar2 = new b(other.f);
            long j = other.g;
            VK other2 = other.j;
            Intrinsics.checkNotNullParameter(other2, "other");
            this.b = new Bk2(newId, enumC3638ek2, str, str2, bVar, bVar2, j, other.h, other.i, new VK(other2.a, other2.b, other2.c, other2.d, other2.e, other2.f, other2.g, other2.h), other.k, other.l, other.m, other.n, other.o, other.p, other.q, other.r, other.s, 524288, 0);
            return k91B;
        }

        @NotNull
        public abstract K91 b();

        @NotNull
        public abstract K91.a c();

        @NotNull
        public final a d(long j) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.b.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.b.g) {
                return (K91.a) this;
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NotNull
        public final B e(@NotNull b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.b.e = inputData;
            return c();
        }
    }

    public AbstractC8099zk2(@NotNull UUID id, @NotNull Bk2 workSpec, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = id;
        this.b = workSpec;
        this.c = tags;
    }
}
