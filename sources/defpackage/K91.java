package defpackage;

import androidx.work.OverwritingInputMerger;
import androidx.work.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K91 extends AbstractC8099zk2 {

    public static final class a extends AbstractC8099zk2.a<a, K91> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends c> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.b.d = OverwritingInputMerger.class.getName();
        }

        @Override // defpackage.AbstractC8099zk2.a
        public final K91 b() {
            Intrinsics.checkNotNullParameter(this, "builder");
            return new K91(this.a, this.b, this.c);
        }

        @Override // defpackage.AbstractC8099zk2.a
        public final a c() {
            return this;
        }
    }
}
