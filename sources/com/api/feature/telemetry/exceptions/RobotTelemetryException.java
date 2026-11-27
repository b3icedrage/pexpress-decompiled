package com.api.feature.telemetry.exceptions;

import defpackage.C0681Bn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0017\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0017\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SetupActionBlocked", "RobotStartFailed", "RobotStoppedUnexpectedly", "WsTradingStopped", "WsRepeatedDisconnects", "ForegroundServiceStartRefused", "BetStartTimeoutException", "BetEndTimeoutException", "WsMessageTimeout", "WsAllEndpointsFailed", "PlatformHostProbeFailed", "WsClosedByOther", "ForcedLogout", "JsonParseException", "SilentJsonParseException", "UnknownBetStatusException", "AppDataFieldStillMissing", "DataUpdaterTargetMissing", "DataUpdaterFailed", "PlatformRefusal", "AuthFlowFailed", "AuthStepStuck", "AuthWsAuthFailed", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AppDataFieldStillMissing;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthFlowFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthStepStuck;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthWsAuthFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$BetEndTimeoutException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$BetStartTimeoutException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$DataUpdaterFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$DataUpdaterTargetMissing;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$ForcedLogout;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$ForegroundServiceStartRefused;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$JsonParseException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$PlatformHostProbeFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$PlatformRefusal;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$RobotStartFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$RobotStoppedUnexpectedly;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$SetupActionBlocked;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$SilentJsonParseException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$UnknownBetStatusException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsAllEndpointsFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsClosedByOther;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsMessageTimeout;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsRepeatedDisconnects;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsTradingStopped;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RobotTelemetryException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AppDataFieldStillMissing;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppDataFieldStillMissing extends RobotTelemetryException {
        public AppDataFieldStillMissing(@NotNull String field, long j) {
            Intrinsics.checkNotNullParameter(field, "field");
            StringBuilder sb = new StringBuilder("AppData field still missing: ");
            sb.append(field);
            sb.append(" after ");
            super(C0681Bn.c(sb, j, "ms"), null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthFlowFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthFlowFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthStepStuck;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthStepStuck extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$AuthWsAuthFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthWsAuthFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$BetEndTimeoutException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BetEndTimeoutException extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$BetStartTimeoutException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BetStartTimeoutException extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$DataUpdaterFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataUpdaterFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$DataUpdaterTargetMissing;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataUpdaterTargetMissing extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$ForcedLogout;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ForcedLogout extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$ForegroundServiceStartRefused;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ForegroundServiceStartRefused extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$JsonParseException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JsonParseException extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$PlatformHostProbeFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlatformHostProbeFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$PlatformRefusal;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlatformRefusal extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$RobotStartFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RobotStartFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$RobotStoppedUnexpectedly;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RobotStoppedUnexpectedly extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$SetupActionBlocked;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SetupActionBlocked extends RobotTelemetryException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupActionBlocked(@NotNull String reason) {
            super("Setup action blocked: " + reason, null);
            Intrinsics.checkNotNullParameter(reason, "reason");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$SilentJsonParseException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SilentJsonParseException extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$UnknownBetStatusException;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownBetStatusException extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsAllEndpointsFailed;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WsAllEndpointsFailed extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsClosedByOther;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WsClosedByOther extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsMessageTimeout;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WsMessageTimeout extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsRepeatedDisconnects;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WsRepeatedDisconnects extends RobotTelemetryException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/telemetry/exceptions/RobotTelemetryException$WsTradingStopped;", "Lcom/api/feature/telemetry/exceptions/RobotTelemetryException;", "FeatureTelemetryApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WsTradingStopped extends RobotTelemetryException {
    }
}
