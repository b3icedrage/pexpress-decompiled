package com.base.core.backend.localmodels;

import defpackage.C1952Ru;
import defpackage.C5491nL;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/base/core/backend/localmodels/Bet;", "", "<init>", "()V", "Successfulness", "Result", "TimeInfo", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Bet {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/base/core/backend/localmodels/Bet$Result;", "", "Lcom/base/core/backend/localmodels/Bet$Successfulness;", "betResult", "Lcom/base/core/backend/localmodels/Bet$Successfulness;", "getBetResult", "()Lcom/base/core/backend/localmodels/Bet$Successfulness;", "", "amountWithSign", "Ljava/lang/String;", "getAmountWithSign", "()Ljava/lang/String;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @NotNull
        private final String amountWithSign;

        @NotNull
        private final Successfulness betResult;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.betResult == result.betResult && Intrinsics.a(this.amountWithSign, result.amountWithSign);
        }

        public final int hashCode() {
            return this.amountWithSign.hashCode() + (this.betResult.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Result(betResult=" + this.betResult + ", amountWithSign=" + this.amountWithSign + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/base/core/backend/localmodels/Bet$Successfulness;", "", "WITH_A_LOSS", "WIN_PROFIT", "WITH_STANDOFF", "RETRY", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Successfulness {
        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
        private static final /* synthetic */ Successfulness[] $VALUES;
        public static final Successfulness RETRY;
        public static final Successfulness WIN_PROFIT;
        public static final Successfulness WITH_A_LOSS;
        public static final Successfulness WITH_STANDOFF;

        static {
            Successfulness successfulness = new Successfulness("WITH_A_LOSS", 0);
            WITH_A_LOSS = successfulness;
            Successfulness successfulness2 = new Successfulness("WIN_PROFIT", 1);
            WIN_PROFIT = successfulness2;
            Successfulness successfulness3 = new Successfulness("WITH_STANDOFF", 2);
            WITH_STANDOFF = successfulness3;
            Successfulness successfulness4 = new Successfulness("RETRY", 3);
            RETRY = successfulness4;
            Successfulness[] successfulnessArr = {successfulness, successfulness2, successfulness3, successfulness4};
            $VALUES = successfulnessArr;
            $ENTRIES = C1952Ru.i(successfulnessArr);
        }

        public Successfulness() {
            throw null;
        }

        public static Successfulness valueOf(String str) {
            return (Successfulness) Enum.valueOf(Successfulness.class, str);
        }

        public static Successfulness[] values() {
            return (Successfulness[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/base/core/backend/localmodels/Bet$TimeInfo;", "", "", "durationMillis", "J", "getDurationMillis", "()J", "openTimeMillis", "getOpenTimeMillis", "closeTimeMillis", "getCloseTimeMillis", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeInfo {
        private final long closeTimeMillis;
        private final long durationMillis;
        private final long openTimeMillis;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeInfo)) {
                return false;
            }
            TimeInfo timeInfo = (TimeInfo) obj;
            return this.durationMillis == timeInfo.durationMillis && this.openTimeMillis == timeInfo.openTimeMillis && this.closeTimeMillis == timeInfo.closeTimeMillis;
        }

        public final int hashCode() {
            return Long.hashCode(this.closeTimeMillis) + C5491nL.a(Long.hashCode(this.durationMillis) * 31, 31, this.openTimeMillis);
        }

        @NotNull
        public final String toString() {
            return "TimeInfo(durationMillis=" + this.durationMillis + ", openTimeMillis=" + this.openTimeMillis + ", closeTimeMillis=" + this.closeTimeMillis + ")";
        }
    }
}
